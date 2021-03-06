/*
 * Copyright (C) 2018  Ľuboš Kozmon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package json.zookeeper.znode

import com.elkozmon.zoonavigator.core.zookeeper.znode.ZNodeChildren
import com.elkozmon.zoonavigator.core.zookeeper.znode.ZNodePath
import org.scalatest.FlatSpec
import play.api.libs.json.JsArray
import play.api.libs.json.Writes

class JsonZNodeChildrenSpec extends FlatSpec {

  "JsonZNodeChildren" should "be serialized as a JSON array" in {
    val jsonZNodeChildren =
      JsonZNodeChildren(ZNodeChildren(List.empty[ZNodePath]))

    assert(
      implicitly[Writes[JsonZNodeChildren]]
        .writes(jsonZNodeChildren)
        .isInstanceOf[JsArray]
    )
  }
}
