grammar Eve;

mulplicitiveOperator
    : '*'
    | '/'
    ;

additiveOperator
    : '+'
    | '-'
    ;

expression
    : Number '.' Number                                                             # realExpression                // -> f64
    | Number                                                                        # integerExpression             // -> i64
    | functionPrototype functionBody                                                # lambdaExpression              // -> functionPrototype

    | Identifier                                                                    # getExpression                 //
    | Identifier '=' expression                                                     # setExpression                 //
    | Identifier '(' expressionList? ')'                                            # callExpression                //

    | expression '.' Identifier ('[' expressionList? ']')?                          # memberGetExpression           //
    | expression '.' Identifier ('[' expressionList? ']')? '=' expression           # memberSetExpression           //
    | expression '.' Identifier '(' expressionList? ')'                             # memberCallExpression          //

    | expression mulplicitiveOperator expression                                    # mulplicitiveExpression        // -> result of lhs.mul(rhs)
    | expression additiveOperator expression                                        # additiveExpression            // -> result of lhs.add(rhs)

    | 'val' Identifier '=' expression                                               # declarationExpression         // -> unit
    ;

expressionList
    : expression ( ',' expression )* ','?
    ;


field
    : Identifier ':' type
    ;

fieldList
    : field ( ',' field )* ','?
    ;

structurePrototype
    : '(' fieldList? ')'
    ;


parameter
    : Identifier ':' type
    ;

parameterList
    : parameter ( ',' parameter )* ','?
    ;

functionPrototype
    : '(' parameterList? ')' ('->' type)?
    ;

functionBody
    : '{' expression* '}'
    | '=' expression
    ;


genericArgument
    : type
    ;

genericArgumentList
    : genericArgument ( ',' genericArgument )* ','?
    ;

genericArgumentsBlock
    : '<' genericArgumentList? '>'
    ;


genericParameter
    : Identifier
    ;

genericParameterList
    : genericParameter ( ',' genericParameter )* ','?
    ;

genericParametersBlock
    : '<' genericParameterList? '>'
    ;


type
    : Identifier genericArgumentsBlock?                                     # namedType
    | '?' type                                                              # optionalType
    | '&' type                                                              # referenceType
    | Number type                                                           # arrayType
    | structurePrototype                                                    # structureType
    | functionPrototype                                                     # functionType
    ;


structureDeclaration
    : ( 'compact' | 'expect' )* 'type' genericParametersBlock? Identifier structurePrototype
    ;

functionDeclaration
    : ( 'inline' | 'expect' )* 'func' Identifier functionPrototype functionBody?
    ;


memberDeclarationGet
    : ( 'inline' | 'expect' )* 'get' functionBody?
    ;

memberDeclarationSet
    : ( 'inline' | 'expect' )* 'set' functionBody?
    ;

memberDeclaration
    : 'memb' scope=type '.' Identifier functionPrototype memberDeclarationGet? memberDeclarationSet?
    ;


compilationUnit
    : ( structureDeclaration | functionDeclaration | memberDeclaration )*
    ;


Identifier
    : [_a-zA-Z] [_a-zA-Z0-9]*
    ;

Number
    : [0-9] [_0-9]*
    ;

WhiteSpace
    : ( ' ' | '\t' | '\r' | '\n' ) -> skip
    ;

BlockComment
    : '/*' .*? '*/' -> skip
    ;

LineComment
    : '//' ~[\r\n]* -> skip
    ;