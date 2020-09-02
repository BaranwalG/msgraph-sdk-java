// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceEnrollmentType;
import com.microsoft.graph.models.generated.DeviceEnrollmentFailureReason;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enrollment Troubleshooting Event.
 */
public class EnrollmentTroubleshootingEvent extends DeviceManagementTroubleshootingEvent implements IJsonBackedObject {


    /**
     * The Managed Device Identifier.
     * Device identifier created or collected by Intune.
     */
    @SerializedName("managedDeviceIdentifier")
    @Expose
    public String managedDeviceIdentifier;

    /**
     * The Operating System.
     * Operating System.
     */
    @SerializedName("operatingSystem")
    @Expose
    public String operatingSystem;

    /**
     * The Os Version.
     * OS Version.
     */
    @SerializedName("osVersion")
    @Expose
    public String osVersion;

    /**
     * The User Id.
     * Identifier for the user that tried to enroll the device.
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The Device Id.
     * Azure AD device identifier.
     */
    @SerializedName("deviceId")
    @Expose
    public String deviceId;

    /**
     * The Enrollment Type.
     * Type of the enrollment. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement.
     */
    @SerializedName("enrollmentType")
    @Expose
    public DeviceEnrollmentType enrollmentType;

    /**
     * The Failure Category.
     * Highlevel failure category. Possible values are: unknown, authentication, authorization, accountValidation, userValidation, deviceNotSupported, inMaintenance, badRequest, featureNotSupported, enrollmentRestrictionsEnforced, clientDisconnected, userAbandonment.
     */
    @SerializedName("failureCategory")
    @Expose
    public DeviceEnrollmentFailureReason failureCategory;

    /**
     * The Failure Reason.
     * Detailed failure reason.
     */
    @SerializedName("failureReason")
    @Expose
    public String failureReason;


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
