// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IThumbnailRequest;
import com.microsoft.graph.requests.extensions.ThumbnailRequest;
import com.microsoft.graph.requests.extensions.IThumbnailStreamRequestBuilder;
import com.microsoft.graph.requests.extensions.ThumbnailStreamRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Thumbnail Request Builder.
 */
public class ThumbnailRequestBuilder extends BaseRequestBuilder implements IThumbnailRequestBuilder {

    /**
     * The request builder for the Thumbnail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThumbnailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IThumbnailRequest instance
     */
    public IThumbnailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IThumbnailRequest instance
     */
    public IThumbnailRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ThumbnailRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IThumbnailStreamRequestBuilder content() {
        return new ThumbnailStreamRequestBuilder(getRequestUrlWithAdditionalSegment("content"), getClient(), null);
    }
}

