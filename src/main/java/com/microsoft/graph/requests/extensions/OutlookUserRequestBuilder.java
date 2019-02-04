// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOutlookUserRequest;
import com.microsoft.graph.requests.extensions.OutlookUserRequest;
import com.microsoft.graph.requests.extensions.IOutlookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookUserSupportedLanguagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedLanguagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookUserSupportedTimeZonesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedTimeZonesCollectionRequestBuilder;
import com.microsoft.graph.models.generated.TimeZoneStandard;
import com.microsoft.graph.requests.extensions.IOutlookUserSupportedTimeZonesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedTimeZonesCollectionRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Request Builder.
 */
public class OutlookUserRequestBuilder extends BaseRequestBuilder implements IOutlookUserRequestBuilder {

    /**
     * The request builder for the OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IOutlookUserRequest instance
     */
    public IOutlookUserRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOutlookUserRequest instance
     */
    public IOutlookUserRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new OutlookUserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IOutlookCategoryCollectionRequestBuilder masterCategories() {
        return new OutlookCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("masterCategories"), getClient(), null);
    }

    public IOutlookCategoryRequestBuilder masterCategories(final String id) {
        return new OutlookCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("masterCategories") + "/" + id, getClient(), null);
    }

    public IOutlookUserSupportedLanguagesCollectionRequestBuilder supportedLanguages() {
        return new OutlookUserSupportedLanguagesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedLanguages"), getClient(), null);
    }

    public IOutlookUserSupportedTimeZonesCollectionRequestBuilder supportedTimeZones() {
        return new OutlookUserSupportedTimeZonesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedTimeZones"), getClient(), null);
    }

    public IOutlookUserSupportedTimeZonesCollectionRequestBuilder supportedTimeZones(final TimeZoneStandard timeZoneStandard) {
        return new OutlookUserSupportedTimeZonesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.supportedTimeZones"), getClient(), null, timeZoneStandard);
    }
}
