package org.dolphinemu.dolphinemu.features.settings.ui.viewholder

import android.text.TextUtils
import android.view.View
import org.dolphinemu.dolphinemu.databinding.ListItemSettingBinding
import org.dolphinemu.dolphinemu.features.settings.model.view.SettingsItem
import org.dolphinemu.dolphinemu.features.settings.model.view.TemporaryStringSetting
import org.dolphinemu.dolphinemu.features.settings.ui.SettingsAdapter

class TemporaryInputStringSettingViewHolder(
  private val binding: ListItemSettingBinding,
  adapter: SettingsAdapter
) : SettingViewHolder(binding.getRoot(), adapter) {
  private lateinit var setting: TemporaryStringSetting

  override val item: SettingsItem
    get() = setting

  override fun bind(item: SettingsItem) {
    setting = item as TemporaryStringSetting

    val inputString = setting.string

    binding.textSettingName.text = setting.name

    if (!TextUtils.isEmpty(inputString)) {
      binding.textSettingDescription.text = inputString
    } else {
      binding.textSettingDescription.text = setting.description
    }

    setStyle(binding.textSettingName, setting)
  }

  override fun onClick(clicked: View) {
    if (!setting.isEditable) {
      showNotRuntimeEditableError()
      return
    }

    val position = bindingAdapterPosition

    adapter.onTemporaryStringInputClick(setting, position)

    setStyle(binding.textSettingName, setting)
  }
}