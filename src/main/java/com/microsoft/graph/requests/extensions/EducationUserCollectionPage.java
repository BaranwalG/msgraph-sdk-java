// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.requests.extensions.IEducationUserCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Collection Page.
 */
public class EducationUserCollectionPage extends BaseCollectionPage<EducationUser, IEducationUserCollectionRequestBuilder> implements IEducationUserCollectionPage {

    /**
     * A collection page for EducationUser
     *
     * @param response the serialized EducationUserCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationUserCollectionPage(final EducationUserCollectionResponse response, final IEducationUserCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}