// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisRequest;
import com.microsoft.graph.models.extensions.WorkbookChartAxis;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Request.
 */
public class WorkbookChartAxisRequest extends BaseRequest implements IWorkbookChartAxisRequest {
	
    /**
     * The request for the WorkbookChartAxis
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxis.class);
    }

    /**
     * Gets the WorkbookChartAxis from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookChartAxis> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartAxis from the service
     *
     * @return the WorkbookChartAxis from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxis get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WorkbookChartAxis> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartAxis with a source
     *
     * @param sourceWorkbookChartAxis the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartAxis sourceWorkbookChartAxis, final ICallback<WorkbookChartAxis> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartAxis);
    }

    /**
     * Patches this WorkbookChartAxis with a source
     *
     * @param sourceWorkbookChartAxis the source object with updates
     * @return the updated WorkbookChartAxis
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxis patch(final WorkbookChartAxis sourceWorkbookChartAxis) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartAxis newWorkbookChartAxis, final ICallback<WorkbookChartAxis> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the new object to create
     * @return the created WorkbookChartAxis
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxis post(final WorkbookChartAxis newWorkbookChartAxis) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAxis);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartAxisRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartAxisRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartAxisRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartAxisRequest)this;
     }

}

