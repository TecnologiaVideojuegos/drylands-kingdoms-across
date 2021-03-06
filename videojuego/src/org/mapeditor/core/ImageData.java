/*-
 * #%L
 * libtiled
 * %%
 * Copyright (C) 2004 - 2018 Thorbj?rn Lindeijer <thorbjorn@lindeijer.nl>
 * %%
 * Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice,
   this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 * #L%
 */
//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci?n de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder?n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.16 a las 09:35:28 PM CEST 
//


package org.mapeditor.core;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Note that it is not currently possible to use Tiled to create<br>
 * maps with embedded image data, even though the TMX format<br>
 * supports this. It is possible to create such maps using<br>
 * `libtiled` (Qt/C++) or<br>
 * [tmxlib](https://pypi.python.org/pypi/tmxlib) (Python).
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
public class ImageData {

    /**
     * @since 0.9
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Data data;
    /**
     * Used for embedded images, in combination with a `data` child<br>
     * element. Valid values are file extensions like `png`, `gif`,<br>
     * `jpg`, `bmp`, etc.<br>
     * <br>
     * @since 0.9
     * 
     */
    @XmlAttribute(name = "format")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String format;
    /**
     * Used by some versions of Tiled Java.<br>
     * <br>
     * @deprecated and unsupported by Tiled Qt.
     * 
     */
    @XmlAttribute(name = "id")
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer id;
    /**
     * The reference to the tileset image file<br>
     * (Tiled supports most common image formats).<br>
     * <br>
     * @since 0.9
     * 
     */
    @XmlAttribute(name = "source")
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String source;
    /**
     * Defines a specific color that is treated as transparent<br>
     * (example value: "#FF00FF" for magenta). Up until Tiled 0.12,<br>
     * this value is written out without a `#` but this is planned<br>
     * to change.
     * 
     */
    @XmlAttribute(name = "trans")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected String trans;
    /**
     * The image width in pixels (optional, used for tile index<br>
     * correction when the image changes)
     * 
     */
    @XmlAttribute(name = "width")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer width;
    /**
     * The image height in pixels (optional)
     * 
     */
    @XmlAttribute(name = "height")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    protected Integer height;

    /**
     * @since 0.9
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Data getData() {
        return data;
    }

    /**
     * @since 0.9
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setData(Data value) {
        this.data = value;
    }

    /**
     * Used for embedded images, in combination with a `data` child<br>
     * element. Valid values are file extensions like `png`, `gif`,<br>
     * `jpg`, `bmp`, etc.<br>
     * <br>
     * @since 0.9
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getFormat() {
        return format;
    }

    /**
     * Used for embedded images, in combination with a `data` child<br>
     * element. Valid values are file extensions like `png`, `gif`,<br>
     * `jpg`, `bmp`, etc.<br>
     * <br>
     * @since 0.9
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Used by some versions of Tiled Java.<br>
     * <br>
     * @deprecated and unsupported by Tiled Qt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getId() {
        return id;
    }

    /**
     * Used by some versions of Tiled Java.<br>
     * <br>
     * @deprecated and unsupported by Tiled Qt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Deprecated
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * The reference to the tileset image file<br>
     * (Tiled supports most common image formats).<br>
     * <br>
     * @since 0.9
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getSource() {
        return source;
    }

    /**
     * The reference to the tileset image file<br>
     * (Tiled supports most common image formats).<br>
     * <br>
     * @since 0.9
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Defines a specific color that is treated as transparent<br>
     * (example value: "#FF00FF" for magenta). Up until Tiled 0.12,<br>
     * this value is written out without a `#` but this is planned<br>
     * to change.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public String getTrans() {
        return trans;
    }

    /**
     * Defines a specific color that is treated as transparent<br>
     * (example value: "#FF00FF" for magenta). Up until Tiled 0.12,<br>
     * this value is written out without a `#` but this is planned<br>
     * to change.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setTrans(String value) {
        this.trans = value;
    }

    /**
     * The image width in pixels (optional, used for tile index<br>
     * correction when the image changes)
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getWidth() {
        return width;
    }

    /**
     * The image width in pixels (optional, used for tile index<br>
     * correction when the image changes)
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * The image height in pixels (optional)
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public Integer getHeight() {
        return height;
    }

    /**
     * The image height in pixels (optional)
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-04-16T09:35:28+02:00", comments = "JAXB RI v2.2.11")
    public void setHeight(Integer value) {
        this.height = value;
    }

}
