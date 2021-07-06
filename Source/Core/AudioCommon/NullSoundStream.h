// Copyright 2008 Dolphin Emulator Project
// SPDX-License-Identifier: GPL-2.0-or-later

#pragma once

#include "AudioCommon/SoundStream.h"

class NullSound final : public SoundStream
{
public:
  bool Init() override;
  void SoundLoop() override;
  bool SetRunning(bool running) override;
  void SetVolume(int volume) override;
  void Update() override;

  static bool isValid() { return true; }
};
