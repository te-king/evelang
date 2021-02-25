package language


sealed class Expression

data class RealExpression(val value: Double) : Expression()
data class IntegerExpression(val value: Long) : Expression()
data class LambdaExpression(val type: FunctionType, val body: List<Expression>) : Expression()
data class GetExpression(val identifier: String) : Expression()
data class SetExpression(val identifier: String, val value: Expression) : Expression()
data class CallExpression(val identifier: String, val arguments: List<Expression>) : Expression()
data class MemberGetExpression(val scope: Expression, val identifier: String, val arguments: List<Expression>) : Expression()
data class MemberSetExpression(val scope: Expression, val identifier: String, val arguments: List<Expression>, val value: Expression) : Expression()
data class MemberCallExpression(val scope: Expression, val identifier: String, val arguments: List<Expression>) : Expression()
//class MultiplicativeExpression
//class AdditiveExpression
data class DeclarationExpression(val identifier: String, val value: Expression) : Expression()