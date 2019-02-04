// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TelecomExpenseManagementPartner;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Telecom Expense Management Partner Collection Page.
 */
public class TelecomExpenseManagementPartnerCollectionPage extends BaseCollectionPage<TelecomExpenseManagementPartner, ITelecomExpenseManagementPartnerCollectionRequestBuilder> implements ITelecomExpenseManagementPartnerCollectionPage {

    /**
     * A collection page for TelecomExpenseManagementPartner
     *
     * @param response the serialized TelecomExpenseManagementPartnerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TelecomExpenseManagementPartnerCollectionPage(final TelecomExpenseManagementPartnerCollectionResponse response, final ITelecomExpenseManagementPartnerCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
