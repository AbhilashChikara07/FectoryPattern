package `in`.oku.serviceproject.designPattern.F.AbstractFectoryDesignPattern

import com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern.CarRequirementClass
import com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern.FactoryClassInterface
import com.example.chikara.factorypattern.CreationalPattern.AbstractFectoryDesignPattern.SwiftCarClass

class SwiftFectoryClass(mTyreName: String, mCarLogo: String) : FactoryClassInterface {

    private var mTyreName: String? = null
    private var mCarLogo: String? = null

    init {
        this.mTyreName = mTyreName
        this.mCarLogo = mCarLogo
    }

    override fun getCarClassObj(): CarRequirementClass {
        return SwiftCarClass(mTyreName, mCarLogo)
    }

}