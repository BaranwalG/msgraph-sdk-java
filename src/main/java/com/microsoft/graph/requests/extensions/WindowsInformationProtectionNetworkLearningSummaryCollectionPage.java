// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionNetworkLearningSummary;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Network Learning Summary Collection Page.
 */
public class WindowsInformationProtectionNetworkLearningSummaryCollectionPage extends BaseCollectionPage<WindowsInformationProtectionNetworkLearningSummary> {

    /**
     * A collection page for WindowsInformationProtectionNetworkLearningSummary
     *
     * @param response the serialized WindowsInformationProtectionNetworkLearningSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsInformationProtectionNetworkLearningSummaryCollectionPage(final WindowsInformationProtectionNetworkLearningSummaryCollectionResponse response, final WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
