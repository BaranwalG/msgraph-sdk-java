// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Role Collection Request Builder.
 */
public interface IDirectoryRoleCollectionRequestBuilder extends IRequestBuilder {

    IDirectoryRoleCollectionRequest buildRequest();

    IDirectoryRoleCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDirectoryRoleRequestBuilder byId(final String id);


    IDirectoryRoleDeltaCollectionRequestBuilder delta();

	IDirectoryRoleDeltaCollectionRequestBuilder delta(final String deltaLink);
}
