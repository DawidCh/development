/*******************************************************************************
 *  Copyright FUJITSU LIMITED 2015 
 *******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.05 at 01:29:11 PM CET 
//

package org.oscm.billingservice.business.model.billingresult;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.oscm.billingservice.business.BigDecimalAdapter;

/**
 * Stepped prices.
 * 
 * <p>
 * Java class for SteppedPricesType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SteppedPricesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SteppedPrice" type="{}SteppedPriceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="amount" use="required" type="{}NormalizedCosts" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SteppedPricesType", propOrder = { "steppedPrice" })
public class SteppedPricesType {

    @XmlElement(name = "SteppedPrice", required = true)
    protected List<SteppedPriceType> steppedPrice;

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    protected BigDecimal amount;

    /**
     * Gets the value of the steppedPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the steppedPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSteppedPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SteppedPriceType }
     * 
     * 
     */
    public List<SteppedPriceType> getSteppedPrice() {
        if (steppedPrice == null) {
            steppedPrice = new ArrayList<SteppedPriceType>();
        }
        return this.steppedPrice;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
