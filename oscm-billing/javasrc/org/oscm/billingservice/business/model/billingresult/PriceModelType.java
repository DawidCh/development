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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Price model details.
 * 
 * <p>
 * Java class for PriceModelType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PriceModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsagePeriod" type="{}PeriodType"/>
 *         &lt;element name="GatheredEvents" type="{}GatheredEventsType" minOccurs="0"/>
 *         &lt;element name="PeriodFee" type="{}PeriodFeeType"/>
 *         &lt;element name="UserAssignmentCosts" type="{}UserAssignmentCostsType" minOccurs="0"/>
 *         &lt;element name="OneTimeFee" type="{}OneTimeFeeType" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{}ParametersType" minOccurs="0"/>
 *         &lt;element name="PriceModelCosts" type="{}DetailedCostsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="calculationMode" type="{}priceModelCalculationType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceModelType", propOrder = { "usagePeriod",
        "gatheredEvents", "periodFee", "userAssignmentCosts", "oneTimeFee",
        "parameters", "priceModelCosts" })
public class PriceModelType {

    @XmlElement(name = "UsagePeriod", required = true)
    protected PeriodType usagePeriod;
    @XmlElement(name = "GatheredEvents")
    protected GatheredEventsType gatheredEvents;
    @XmlElement(name = "PeriodFee", required = true)
    protected PeriodFeeType periodFee;
    @XmlElement(name = "UserAssignmentCosts")
    protected UserAssignmentCostsType userAssignmentCosts;
    @XmlElement(name = "OneTimeFee")
    protected OneTimeFeeType oneTimeFee;
    @XmlElement(name = "Parameters")
    protected ParametersType parameters;
    @XmlElement(name = "PriceModelCosts", required = true)
    protected DetailedCostsType priceModelCosts;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute
    protected PriceModelCalculationType calculationMode;
    @XmlAttribute
    protected String serviceId;

    /**
     * Gets the value of the usagePeriod property.
     * 
     * @return possible object is {@link PeriodType }
     * 
     */
    public PeriodType getUsagePeriod() {
        return usagePeriod;
    }

    /**
     * Sets the value of the usagePeriod property.
     * 
     * @param value
     *            allowed object is {@link PeriodType }
     * 
     */
    public void setUsagePeriod(PeriodType value) {
        this.usagePeriod = value;
    }

    /**
     * Gets the value of the gatheredEvents property.
     * 
     * @return possible object is {@link GatheredEventsType }
     * 
     */
    public GatheredEventsType getGatheredEvents() {
        return gatheredEvents;
    }

    /**
     * Sets the value of the gatheredEvents property.
     * 
     * @param value
     *            allowed object is {@link GatheredEventsType }
     * 
     */
    public void setGatheredEvents(GatheredEventsType value) {
        this.gatheredEvents = value;
    }

    /**
     * Gets the value of the periodFee property.
     * 
     * @return possible object is {@link PeriodFeeType }
     * 
     */
    public PeriodFeeType getPeriodFee() {
        return periodFee;
    }

    /**
     * Sets the value of the periodFee property.
     * 
     * @param value
     *            allowed object is {@link PeriodFeeType }
     * 
     */
    public void setPeriodFee(PeriodFeeType value) {
        this.periodFee = value;
    }

    /**
     * Gets the value of the userAssignmentCosts property.
     * 
     * @return possible object is {@link UserAssignmentCostsType }
     * 
     */
    public UserAssignmentCostsType getUserAssignmentCosts() {
        return userAssignmentCosts;
    }

    /**
     * Sets the value of the userAssignmentCosts property.
     * 
     * @param value
     *            allowed object is {@link UserAssignmentCostsType }
     * 
     */
    public void setUserAssignmentCosts(UserAssignmentCostsType value) {
        this.userAssignmentCosts = value;
    }

    /**
     * Gets the value of the oneTimeFee property.
     * 
     * @return possible object is {@link OneTimeFeeType }
     * 
     */
    public OneTimeFeeType getOneTimeFee() {
        return oneTimeFee;
    }

    /**
     * Sets the value of the oneTimeFee property.
     * 
     * @param value
     *            allowed object is {@link OneTimeFeeType }
     * 
     */
    public void setOneTimeFee(OneTimeFeeType value) {
        this.oneTimeFee = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return possible object is {@link ParametersType }
     * 
     */
    public ParametersType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *            allowed object is {@link ParametersType }
     * 
     */
    public void setParameters(ParametersType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the priceModelCosts property.
     * 
     * @return possible object is {@link DetailedCostsType }
     * 
     */
    public DetailedCostsType getPriceModelCosts() {
        return priceModelCosts;
    }

    /**
     * Sets the value of the priceModelCosts property.
     * 
     * @param value
     *            allowed object is {@link DetailedCostsType }
     * 
     */
    public void setPriceModelCosts(DetailedCostsType value) {
        this.priceModelCosts = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the calculationMode property.
     * 
     * @return possible object is {@link PriceModelCalculationType }
     * 
     */
    public PriceModelCalculationType getCalculationMode() {
        return calculationMode;
    }

    /**
     * Sets the value of the calculationMode property.
     * 
     * @param value
     *            allowed object is {@link PriceModelCalculationType }
     * 
     */
    public void setCalculationMode(PriceModelCalculationType value) {
        this.calculationMode = value;
    }

}
