// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SiteGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteGetActivitiesByIntervalCollectionPage;
import com.microsoft.graph.requests.extensions.SiteGetActivitiesByIntervalCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Get Activities By Interval Collection Page.
 */
public class SiteGetActivitiesByIntervalCollectionPage extends BaseCollectionPage<ItemActivityStat> {

    /**
     * A collection page for ItemActivityStat.
     *
     * @param response The serialized SiteGetActivitiesByIntervalCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public SiteGetActivitiesByIntervalCollectionPage(final SiteGetActivitiesByIntervalCollectionResponse response, final SiteGetActivitiesByIntervalCollectionRequestBuilder builder) {
       super(response, builder);
    }
}
