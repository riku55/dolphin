package org.dolphinemu.dolphinemu.features.settings.model.view

import android.content.Context
import org.dolphinemu.dolphinemu.features.settings.model.AbstractSetting

class TemporaryStringSetting(
    context: Context,
    titleId: Int,
    descriptionId: Int
): SettingsItem(context, titleId, descriptionId) {

    override val setting: AbstractSetting? = null
    override val type: Int = TYPE_TEMPORARY_STRING

    var string = String()

}