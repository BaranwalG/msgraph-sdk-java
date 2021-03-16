// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.PrintJobConfiguration;
import com.microsoft.graph.models.UserIdentity;
import com.microsoft.graph.models.PrintJobStatus;
import com.microsoft.graph.models.PrintDocument;
import com.microsoft.graph.models.PrintTask;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.PrintDocumentCollectionPage;
import com.microsoft.graph.requests.PrintTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job.
 */
public class PrintJob extends Entity implements IJsonBackedObject {


    /**
     * The Configuration.
     * A group of settings that a printer should use to print a job.
     */
    @SerializedName(value = "configuration", alternate = {"Configuration"})
    @Expose
	@Nullable
    public PrintJobConfiguration configuration;

    /**
     * The Created By.
     * Read-only. Nullable.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public UserIdentity createdBy;

    /**
     * The Created Date Time.
     * The DateTimeOffset when the job was created. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Is Fetchable.
     * If true, document can be fetched by printer.
     */
    @SerializedName(value = "isFetchable", alternate = {"IsFetchable"})
    @Expose
	@Nullable
    public Boolean isFetchable;

    /**
     * The Redirected From.
     * Contains the source job URL, if the job has been redirected from another printer.
     */
    @SerializedName(value = "redirectedFrom", alternate = {"RedirectedFrom"})
    @Expose
	@Nullable
    public String redirectedFrom;

    /**
     * The Redirected To.
     * Contains the destination job URL, if the job has been redirected to another printer.
     */
    @SerializedName(value = "redirectedTo", alternate = {"RedirectedTo"})
    @Expose
	@Nullable
    public String redirectedTo;

    /**
     * The Status.
     * The status of the print job. Read-only.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public PrintJobStatus status;

    /**
     * The Documents.
     * Read-only.
     */
    @SerializedName(value = "documents", alternate = {"Documents"})
    @Expose
	@Nullable
    public PrintDocumentCollectionPage documents;

    /**
     * The Tasks.
     * A list of printTasks that were triggered by this print job.
     */
    @SerializedName(value = "tasks", alternate = {"Tasks"})
    @Expose
	@Nullable
    public PrintTaskCollectionPage tasks;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("documents")) {
            documents = serializer.deserializeObject(json.get("documents"), PrintDocumentCollectionPage.class);
        }

        if (json.has("tasks")) {
            tasks = serializer.deserializeObject(json.get("tasks"), PrintTaskCollectionPage.class);
        }
    }
}