// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CalendarGroup;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group Collection Page.
 */
public class CalendarGroupCollectionPage extends BaseCollectionPage<CalendarGroup> {

    /**
     * A collection page for CalendarGroup
     *
     * @param response the serialized CalendarGroupCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CalendarGroupCollectionPage(final CalendarGroupCollectionResponse response, final CalendarGroupCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
