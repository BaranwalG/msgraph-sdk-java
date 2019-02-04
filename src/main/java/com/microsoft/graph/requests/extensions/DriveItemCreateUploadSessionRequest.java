// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DriveItemCreateUploadSessionBody;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.requests.extensions.IDriveItemCreateUploadSessionRequest;
import com.microsoft.graph.requests.extensions.DriveItemCreateUploadSessionRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Create Upload Session Request.
 */
public class DriveItemCreateUploadSessionRequest extends BaseRequest implements IDriveItemCreateUploadSessionRequest {
    protected final DriveItemCreateUploadSessionBody body;

    /**
     * The request for this DriveItemCreateUploadSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemCreateUploadSessionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, UploadSession.class);
        body = new DriveItemCreateUploadSessionBody();
    }

    public void post(final ICallback<UploadSession> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public UploadSession post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDriveItemCreateUploadSessionRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (DriveItemCreateUploadSessionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDriveItemCreateUploadSessionRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (DriveItemCreateUploadSessionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDriveItemCreateUploadSessionRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (DriveItemCreateUploadSessionRequest)this;
    }

}
