// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingEvent;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Troubleshooting Event Collection Page.
 */
public class DeviceManagementTroubleshootingEventCollectionPage extends BaseCollectionPage<DeviceManagementTroubleshootingEvent> {

    /**
     * A collection page for DeviceManagementTroubleshootingEvent
     *
     * @param response the serialized DeviceManagementTroubleshootingEventCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementTroubleshootingEventCollectionPage(final DeviceManagementTroubleshootingEventCollectionResponse response, final DeviceManagementTroubleshootingEventCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
