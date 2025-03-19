
package com.jlcindia.jaxws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllCoursesResponse", namespace = "http://jaxws.jlcindia.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllCoursesResponse", namespace = "http://jaxws.jlcindia.com/")
public class GetAllCoursesResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.jlcindia.jaxws.CourseTO> _return;

    /**
     * 
     * @return
     *     returns List<CourseTO>
     */
    public List<com.jlcindia.jaxws.CourseTO> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.jlcindia.jaxws.CourseTO> _return) {
        this._return = _return;
    }

}
