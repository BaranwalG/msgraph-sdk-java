// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Directory;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Request Builder.
 */
public class DirectoryRequestBuilder extends BaseRequestBuilder implements IDirectoryRequestBuilder {

    /**
     * The request builder for the Directory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDirectoryRequest instance
     */
    public IDirectoryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDirectoryRequest instance
     */
    public IDirectoryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DirectoryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDirectoryObjectCollectionRequestBuilder deletedItems() {
        return new DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems"), getClient(), null);
    }

    public IDirectoryObjectRequestBuilder deletedItems(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems") + "/" + id, getClient(), null);
    }
}
