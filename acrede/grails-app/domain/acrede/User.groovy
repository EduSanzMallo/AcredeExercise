package acrede

import org.springframework.context.i18n.LocaleContextHolder as LCH
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlElement

@XmlAccessorType(XmlAccessType.NONE)
class User implements Serializable {
    @XmlElement
    String username
    @XmlElement
    Integer postcode
    @XmlElement
    String email

    static constraints = {
        username(blank: false, maxSize: 10)
        postcode(blank: false, range: 1..999)
        email(blank: false, validator: { val, obj ->
            def locale = LCH.getLocale().getCountry()
            def emailPattern
            println locale
            if(locale == 'ES'){
                emailPattern = /[_A-Za-z0-9-]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+\.(?:[A-Z]{2}|miapuesta-es|vistabet)/
            }else if(locale == 'EN'){
                emailPattern = /[_A-Za-z0-9-]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+\.(?:[A-Z]{2}|org.uk|co.uk|biz)/
            }else if(locale == 'BR'){
                emailPattern = /[_A-Za-z0-9-]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+\.(?:[A-Z]{2}|org.br|info)/
            }
            return val ==~ emailPattern
        })
    }
}
