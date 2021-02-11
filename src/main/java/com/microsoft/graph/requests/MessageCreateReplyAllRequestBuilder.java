// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.MessageCreateReplyAllRequest;
import com.microsoft.graph.models.Message;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.MessageCreateReplyAllParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Create Reply All Request Builder.
 */
public class MessageCreateReplyAllRequestBuilder extends BaseActionRequestBuilder<Message> {

    /**
     * The request builder for this MessageCreateReplyAll
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MessageCreateReplyAllRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private MessageCreateReplyAllParameterSet body;
    /**
     * The request builder for this MessageCreateReplyAll
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public MessageCreateReplyAllRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final MessageCreateReplyAllParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the MessageCreateReplyAllRequest
     *
     * @param requestOptions the options for the request
     * @return the MessageCreateReplyAllRequest instance
     */
    @Nonnull
    public MessageCreateReplyAllRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the MessageCreateReplyAllRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the MessageCreateReplyAllRequest instance
     */
    @Nonnull
    public MessageCreateReplyAllRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final MessageCreateReplyAllRequest request = new MessageCreateReplyAllRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
