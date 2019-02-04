// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesFormatRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Gridlines Format Request Builder.
 */
public interface IWorkbookChartGridlinesFormatRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookChartGridlinesFormatRequest instance
     */
    IWorkbookChartGridlinesFormatRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartGridlinesFormatRequest instance
     */
    IWorkbookChartGridlinesFormatRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    /**
     * Gets the request builder for WorkbookChartLineFormat
     *
     * @return the IWorkbookChartLineFormatRequestBuilder instance
     */
    IWorkbookChartLineFormatRequestBuilder line();

}
