// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MailTipsType;
import com.microsoft.graph.models.MailTips;
import java.util.EnumSet;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UserGetMailTipsCollectionRequestBuilder;
import com.microsoft.graph.requests.UserGetMailTipsCollectionRequest;
import com.microsoft.graph.requests.UserGetMailTipsCollectionResponse;
import com.microsoft.graph.models.UserGetMailTipsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Mail Tips Collection Request Builder.
 */
public class UserGetMailTipsCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<MailTips, UserGetMailTipsCollectionRequestBuilder, UserGetMailTipsCollectionResponse, UserGetMailTipsCollectionPage, UserGetMailTipsCollectionRequest> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserGetMailTipsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserGetMailTipsCollectionRequestBuilder.class, UserGetMailTipsCollectionRequest.class);
    }
    private UserGetMailTipsParameterSet body;
    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UserGetMailTipsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UserGetMailTipsParameterSet parameters) {
        super(requestUrl, client, requestOptions, UserGetMailTipsCollectionRequestBuilder.class, UserGetMailTipsCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserGetMailTipsCollectionRequest instance
     */
    @Override
    @Nonnull
    public UserGetMailTipsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserGetMailTipsCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
