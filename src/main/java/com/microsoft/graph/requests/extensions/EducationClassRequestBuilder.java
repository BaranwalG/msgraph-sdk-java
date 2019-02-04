// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEducationClassRequest;
import com.microsoft.graph.requests.extensions.EducationClassRequest;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupWithReferenceRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Request Builder.
 */
public class EducationClassRequestBuilder extends BaseRequestBuilder implements IEducationClassRequestBuilder {

    /**
     * The request builder for the EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEducationClassRequest instance
     */
    public IEducationClassRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEducationClassRequest instance
     */
    public IEducationClassRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EducationClassRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IEducationSchoolCollectionWithReferencesRequestBuilder schools() {
        return new EducationSchoolCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("schools"), getClient(), null);
    }

    public IEducationSchoolWithReferenceRequestBuilder schools(final String id) {
        return new EducationSchoolWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("schools") + "/" + id, getClient(), null);
    }
    public IEducationUserCollectionWithReferencesRequestBuilder members() {
        return new EducationUserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public IEducationUserWithReferenceRequestBuilder members(final String id) {
        return new EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public IEducationUserCollectionWithReferencesRequestBuilder teachers() {
        return new EducationUserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("teachers"), getClient(), null);
    }

    public IEducationUserWithReferenceRequestBuilder teachers(final String id) {
        return new EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("teachers") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Group
     *
     * @return the IGroupWithReferenceRequestBuilder instance
     */
    public IGroupWithReferenceRequestBuilder group() {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("group"), getClient(), null);
    }
}
