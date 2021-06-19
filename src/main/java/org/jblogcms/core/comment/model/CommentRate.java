/*
 * Copyright 2016 Victor Andreenko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jblogcms.core.comment.model;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.jblogcms.core.common.model.ItemRate;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Provides the base model interface for the Comment Rate service.
 * Represents a row in the <i>comment_rate</i> database table,
 * with each column mapped to a property of this class.
 *
 * @author Victor Andreenko
 */
@Entity
@Table(name = "comment_rate")
@DynamicInsert
@DynamicUpdate
public class CommentRate
        extends ItemRate<Comment>
        implements Serializable {

    private static final long serialVersionUID = -9221322081146529335L;

    @Override
    @PrePersist
    public void prePersist() {
        super.prePersist();
    }

}
