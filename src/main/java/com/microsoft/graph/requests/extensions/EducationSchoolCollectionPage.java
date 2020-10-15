// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Collection Page.
 */
public class EducationSchoolCollectionPage extends BaseCollectionPage<EducationSchool> {

    /**
     * A collection page for EducationSchool
     *
     * @param response the serialized EducationSchoolCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationSchoolCollectionPage(final EducationSchoolCollectionResponse response, final EducationSchoolCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
