package compilation


data class TargetInformation(
    val pointerSize: Long,                              // Size used for pointers in bytes
    val minimumAddressableStepSize: Long,               // Minimum addressable separation in bytes
    val preferredAddressableStepSize: Long,             // Preferred addressable separation in bytes
)