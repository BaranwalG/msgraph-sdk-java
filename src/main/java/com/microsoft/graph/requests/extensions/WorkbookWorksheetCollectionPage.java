// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Collection Page.
 */
public class WorkbookWorksheetCollectionPage extends BaseCollectionPage<WorkbookWorksheet, IWorkbookWorksheetCollectionRequestBuilder> implements IWorkbookWorksheetCollectionPage {

    /**
     * A collection page for WorkbookWorksheet
     *
     * @param response the serialized WorkbookWorksheetCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookWorksheetCollectionPage(final WorkbookWorksheetCollectionResponse response, final IWorkbookWorksheetCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
