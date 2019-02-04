// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOnenoteEntityHierarchyModelRequest;
import com.microsoft.graph.requests.extensions.OnenoteEntityHierarchyModelRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Entity Hierarchy Model Request Builder.
 */
public class OnenoteEntityHierarchyModelRequestBuilder extends BaseRequestBuilder implements IOnenoteEntityHierarchyModelRequestBuilder {

    /**
     * The request builder for the OnenoteEntityHierarchyModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteEntityHierarchyModelRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IOnenoteEntityHierarchyModelRequest instance
     */
    public IOnenoteEntityHierarchyModelRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOnenoteEntityHierarchyModelRequest instance
     */
    public IOnenoteEntityHierarchyModelRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new OnenoteEntityHierarchyModelRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

