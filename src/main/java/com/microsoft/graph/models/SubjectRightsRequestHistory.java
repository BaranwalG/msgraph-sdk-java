// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.SubjectRightsRequestStage;
import com.microsoft.graph.models.SubjectRightsRequestStageStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subject Rights Request History.
 */
public class SubjectRightsRequestHistory implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Changed By.
     * Identity of the user who changed the  subject rights request.
     */
    @SerializedName(value = "changedBy", alternate = {"ChangedBy"})
    @Expose
	@Nullable
    public IdentitySet changedBy;

    /**
     * The Event Date Time.
     * Data and time when the entity was changed.
     */
    @SerializedName(value = "eventDateTime", alternate = {"EventDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime eventDateTime;

    /**
     * The Stage.
     * The stage when the entity was changed. Possible values are: contentRetrieval, contentReview, generateReport, contentDeletion, caseResolved, unknownFutureValue.
     */
    @SerializedName(value = "stage", alternate = {"Stage"})
    @Expose
	@Nullable
    public SubjectRightsRequestStage stage;

    /**
     * The Stage Status.
     * The status of the stage when the entity was changed. Possible values are: notStarted, current, completed, failed, unknownFutureValue.
     */
    @SerializedName(value = "stageStatus", alternate = {"StageStatus"})
    @Expose
	@Nullable
    public SubjectRightsRequestStageStatus stageStatus;

    /**
     * The Type.
     * Type of history.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}