// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Section Group Request Builder.
 */
public class SectionGroupRequestBuilder extends BaseRequestBuilder implements ISectionGroupRequestBuilder {

    /**
     * The request builder for the SectionGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SectionGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ISectionGroupRequest instance
     */
    public ISectionGroupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISectionGroupRequest instance
     */
    public ISectionGroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SectionGroupRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Notebook
     *
     * @return the INotebookRequestBuilder instance
     */
    public INotebookRequestBuilder parentNotebook() {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment("parentNotebook"), getClient(), null);
    }

    /**
     * Gets the request builder for SectionGroup
     *
     * @return the ISectionGroupRequestBuilder instance
     */
    public ISectionGroupRequestBuilder parentSectionGroup() {
        return new SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("parentSectionGroup"), getClient(), null);
    }
    public IOnenoteSectionCollectionRequestBuilder sections() {
        return new OnenoteSectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections"), getClient(), null);
    }

    public IOnenoteSectionRequestBuilder sections(final String id) {
        return new OnenoteSectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections") + "/" + id, getClient(), null);
    }
    public ISectionGroupCollectionRequestBuilder sectionGroups() {
        return new SectionGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups"), getClient(), null);
    }

    public ISectionGroupRequestBuilder sectionGroups(final String id) {
        return new SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups") + "/" + id, getClient(), null);
    }
}
