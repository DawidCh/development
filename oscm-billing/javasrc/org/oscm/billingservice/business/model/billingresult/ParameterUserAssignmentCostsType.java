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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.oscm.billingservice.business.BigDecimalAdapter;

/**
 * 
 * Costs for the parameter based on user-related prices and the number of user
 * assignments.
 * 
 * 
 * <p>
 * Java class for ParameterUserAssignmentCostsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterUserAssignmentCostsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoleCosts" type="{}RoleCostsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="basePeriod" use="required" type="{}basePeriodType" />
 *       &lt;attribute name="basePrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="factor" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="price" use="required" type="{}NormalizedCosts" />
 *       &lt;attribute name="total" type="{}NormalizedCosts" />
 *       &lt;attribute name="valueFactor" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterUserAssignmentCostsType", propOrder = { "roleCosts" })
public class ParameterUserAssignmentCostsType {

    @XmlElement(name = "RoleCosts")
    protected RoleCostsType roleCosts;

    @XmlAttribute(required = true)
    protected BasePeriodType basePeriod;

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    protected BigDecimal basePrice;

    @XmlAttribute(required = true)
    protected BigDecimal factor;

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    protected BigDecimal price;

    @XmlAttribute
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    protected BigDecimal total;

    @XmlAttribute(required = true)
    protected float valueFactor;

    /**
     * Gets the value of the roleCosts property.
     * 
     * @return possible object is {@link RoleCostsType }
     * 
     */
    public RoleCostsType getRoleCosts() {
        return roleCosts;
    }

    /**
     * Sets the value of the roleCosts property.
     * 
     * @param value
     *            allowed object is {@link RoleCostsType }
     * 
     */
    public void setRoleCosts(RoleCostsType value) {
        this.roleCosts = value;
    }

    /**
     * Gets the value of the basePeriod property.
     * 
     * @return possible object is {@link BasePeriodType }
     * 
     */
    public BasePeriodType getBasePeriod() {
        return basePeriod;
    }

    /**
     * Sets the value of the basePeriod property.
     * 
     * @param value
     *            allowed object is {@link BasePeriodType }
     * 
     */
    public void setBasePeriod(BasePeriodType value) {
        this.basePeriod = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setBasePrice(BigDecimal value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the factor property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setFactor(BigDecimal value) {
        this.factor = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the valueFactor property.
     * 
     */
    public float getValueFactor() {
        return valueFactor;
    }

    /**
     * Sets the value of the valueFactor property.
     * 
     */
    public void setValueFactor(float value) {
        this.valueFactor = value;
    }

}
