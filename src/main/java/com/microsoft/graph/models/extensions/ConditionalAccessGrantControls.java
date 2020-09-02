// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ConditionalAccessGrantControl;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Grant Controls.
 */
public class ConditionalAccessGrantControls implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Operator.
     * Defines the relationship of the grant controls. Possible values: AND, OR.
     */
    @SerializedName("operator")
    @Expose
    public String operator;

    /**
     * The Built In Controls.
     * List of values of built-in controls required by the policy. Possible values: Block, Mfa, CompliantDevice, DomainJoinedDevice, ApprovedApplication, CompliantApplication
     */
    @SerializedName("builtInControls")
    @Expose
    public java.util.List<ConditionalAccessGrantControl> builtInControls;

    /**
     * The Custom Authentication Factors.
     * List of custom controls IDs required by the policy. For more information, see Custom controls.
     */
    @SerializedName("customAuthenticationFactors")
    @Expose
    public java.util.List<String> customAuthenticationFactors;

    /**
     * The Terms Of Use.
     * List of terms of use IDs required by the policy.
     */
    @SerializedName("termsOfUse")
    @Expose
    public java.util.List<String> termsOfUse;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
