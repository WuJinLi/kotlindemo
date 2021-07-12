package lnclass

/**
 * 密封类 关键字sealed来修饰
 * 密封类可以有若干个子类，且子类都要继承密封类，且这些子类必须和他定义在同一个文件中
 */
fun main() {
    println(Driver1(LicenseStatus1.Qualifiled("12345678")).checkLicence())
}


/**
 * 业务场景1：
 * 驾照状态：UNQUALIFILED，LEARNING，QUALIFILED。实现对应描述信息的返回
 */
enum class LicenseStatus {
    UNQUALIFILED,
    LEARNING,
    QUALIFILED
}

class Driver(var status: LicenseStatus) {
    fun checkLicence(): String {
        return when (status) {
            LicenseStatus.UNQUALIFILED -> "没资格"
            LicenseStatus.LEARNING -> "在学"
            LicenseStatus.QUALIFILED -> "有资格"
        }
    }
}


/**
 * 业务场景2：
 * 由于业务场景1实现了状态信息的展示，但是针对QUALIFILED状态下，需要输出驾驶人的证件信息，这样不方便通过枚举类不方便实现
 * 则使用密封类去实现
 */
sealed class LicenseStatus1 {
    //object 修饰的类都不必多次初始化
    object UnQualifiled : LicenseStatus1()
    object Learning : LicenseStatus1()
    class Qualifiled(val licenseId: String) : LicenseStatus1()
}

class Driver1(var status: LicenseStatus1) {
    fun checkLicence(): String {
        return when (status) {
            is LicenseStatus1.UnQualifiled -> "没资格"
            is LicenseStatus1.Learning -> "在学"
            is LicenseStatus1.Qualifiled -> "有资格，驾驶证号码为：${(status as LicenseStatus1.Qualifiled).licenseId}"
        }
    }
}

