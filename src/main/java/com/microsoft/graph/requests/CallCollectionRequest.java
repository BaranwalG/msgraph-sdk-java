// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CloudCommunications;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.graph.models.MediaConfig;
import com.microsoft.graph.models.Modality;
import com.microsoft.graph.models.CancelMediaProcessingOperation;
import com.microsoft.graph.models.ScreenSharingRole;
import com.microsoft.graph.models.MuteParticipantOperation;
import com.microsoft.graph.models.Prompt;
import com.microsoft.graph.models.PlayPromptOperation;
import com.microsoft.graph.models.RecordOperation;
import com.microsoft.graph.models.RejectReason;
import com.microsoft.graph.models.SubscribeToToneOperation;
import com.microsoft.graph.models.UnmuteParticipantOperation;
import com.microsoft.graph.models.RecordingStatus;
import com.microsoft.graph.models.UpdateRecordingStatusOperation;
import com.microsoft.graph.models.TeleconferenceDeviceQuality;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.CallCollectionResponse;
import com.microsoft.graph.requests.CallCollectionRequestBuilder;
import com.microsoft.graph.requests.CallCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Collection Request.
 */
public class CallCollectionRequest extends BaseEntityCollectionRequest<Call, CallCollectionResponse, CallCollectionPage> {

    /**
     * The request builder for this collection of Call
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CallCollectionResponse.class, CallCollectionPage.class, CallCollectionRequestBuilder.class);
    }

    /**
     * Creates a new Call
     * @param newCall the Call to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Call> postAsync(@Nonnull final Call newCall) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CallRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newCall);
    }

    /**
     * Creates a new Call
     * @param newCall the Call to create
     * @return the newly created object
     */
    @Nonnull
    public Call post(@Nonnull final Call newCall) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CallRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCall);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public CallCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public CallCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public CallCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public CallCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public CallCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public CallCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public CallCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public CallCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public CallCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
