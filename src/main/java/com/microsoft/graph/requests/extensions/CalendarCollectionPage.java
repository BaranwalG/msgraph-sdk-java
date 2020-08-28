// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.requests.extensions.ICalendarCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CalendarCollectionPage;
import com.microsoft.graph.requests.extensions.CalendarCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Collection Page.
 */
public class CalendarCollectionPage extends BaseCollectionPage<Calendar, ICalendarCollectionRequestBuilder> implements ICalendarCollectionPage {

    /**
     * A collection page for Calendar
     *
     * @param response the serialized CalendarCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CalendarCollectionPage(final CalendarCollectionResponse response, final ICalendarCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
