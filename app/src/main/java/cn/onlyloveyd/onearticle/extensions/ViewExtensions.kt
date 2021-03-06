/**
 * Copyright 2017 yidong
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.onlyloveyd.onearticle.extensions

import android.content.Context
import android.view.View
import android.widget.TextView

/**
 * 文 件 名: ViewExtensions
 * 创 建 人: 易冬
 * 创建日期: 2017/6/20 15:48
 * 描   述：
 */
val View.ctx: Context
    get() = context

//var TextView.textColor: Int
//    get() = currentTextColor
//    set(v) = setTextColor(v)
//
//fun View.slideExit() {
//    if (translationY == 0f) animate().translationY(-height.toFloat())
//}
//
//fun View.slideEnter() {
//    if (translationY < 0f) animate().translationY(0f)
//}