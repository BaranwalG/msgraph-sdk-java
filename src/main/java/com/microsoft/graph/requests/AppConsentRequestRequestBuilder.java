// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AppConsentRequest;
import com.microsoft.graph.models.ConsentRequestFilterByCurrentUserOptions;
import com.microsoft.graph.requests.UserConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.UserConsentRequestRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Consent Request Request Builder.
 */
public class AppConsentRequestRequestBuilder extends BaseRequestBuilder<AppConsentRequest> {

    /**
     * The request builder for the AppConsentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppConsentRequestRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AppConsentRequestRequest instance
     */
    @Nonnull
    public AppConsentRequestRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AppConsentRequestRequest instance
     */
    @Nonnull
    public AppConsentRequestRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AppConsentRequestRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the UserConsentRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserConsentRequestCollectionRequestBuilder userConsentRequests() {
        return new UserConsentRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userConsentRequests"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserConsentRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserConsentRequestRequestBuilder userConsentRequests(@Nonnull final String id) {
        return new UserConsentRequestRequestBuilder(getRequestUrlWithAdditionalSegment("userConsentRequests") + "/" + id, getClient(), null);
    }
}