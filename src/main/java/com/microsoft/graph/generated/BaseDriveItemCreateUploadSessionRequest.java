// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Item Create Upload Session Request.
 */
public class BaseDriveItemCreateUploadSessionRequest extends BaseRequest implements IBaseDriveItemCreateUploadSessionRequest {
    protected final DriveItemCreateUploadSessionBody mBody;

    /**
     * The request for this DriveItemCreateUploadSession
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDriveItemCreateUploadSessionRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, UploadSession.class);
        mBody = new DriveItemCreateUploadSessionBody();
    }

    public void post(final ICallback<UploadSession> callback) {
        send(HttpMethod.POST, callback, mBody);
    }

    public UploadSession post() throws ClientException {
        return send(HttpMethod.POST, mBody);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDriveItemCreateUploadSessionRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (DriveItemCreateUploadSessionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDriveItemCreateUploadSessionRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (DriveItemCreateUploadSessionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IDriveItemCreateUploadSessionRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (DriveItemCreateUploadSessionRequest)this;
    }

}