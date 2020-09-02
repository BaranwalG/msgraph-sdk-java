// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.Report;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Request.
 */
public class ReportRootRequest extends BaseRequest implements IReportRootRequest {
	
    /**
     * The request for the ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRoot.class);
    }

    /**
     * Gets the ReportRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ReportRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ReportRoot from the service
     *
     * @return the ReportRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReportRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ReportRoot> callback) {
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
     * Patches this ReportRoot with a source
     *
     * @param sourceReportRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ReportRoot sourceReportRoot, final ICallback<ReportRoot> callback) {
        send(HttpMethod.PATCH, callback, sourceReportRoot);
    }

    /**
     * Patches this ReportRoot with a source
     *
     * @param sourceReportRoot the source object with updates
     * @return the updated ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReportRoot patch(final ReportRoot sourceReportRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ReportRoot newReportRoot, final ICallback<ReportRoot> callback) {
        send(HttpMethod.POST, callback, newReportRoot);
    }

    /**
     * Creates a ReportRoot with a new object
     *
     * @param newReportRoot the new object to create
     * @return the created ReportRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ReportRoot post(final ReportRoot newReportRoot) throws ClientException {
        return send(HttpMethod.POST, newReportRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IReportRootRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ReportRootRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IReportRootRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ReportRootRequest)this;
     }

}

