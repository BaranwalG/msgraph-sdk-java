// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.models.extensions.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnAddRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnItemAtRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookTableColumnCountRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Column Collection Request Builder.
 */
public class WorkbookTableColumnCollectionRequestBuilder extends BaseRequestBuilder implements IWorkbookTableColumnCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookTable
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableColumnCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookTableColumnCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookTableColumnCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookTableColumnCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookTableColumnRequestBuilder byId(final String id) {
        return new WorkbookTableColumnRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IWorkbookTableColumnAddRequestBuilder add(final Integer index, final com.google.gson.JsonElement values, final String name) {
        return new WorkbookTableColumnAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, index, values, name);
    }

    public IWorkbookTableColumnItemAtRequestBuilder itemAt(final Integer index) {
        return new WorkbookTableColumnItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }

    public IWorkbookTableColumnCountRequestBuilder count() {
        return new WorkbookTableColumnCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }
}
