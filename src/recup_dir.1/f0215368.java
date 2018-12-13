:18:45.496
     inf: {SetupCopyOEMInf: C:\Windows\INF\volume.inf} 01:18:45.496
     inf:      Driver Store location: C:\Windows\System32\DriverStore\FileRepository\volume.inf_amd64_neutral_1b1a512d99c5b72c\volume.inf
     inf:      Published Inf Path: C:\Windows\INF\volume.inf
     inf: {SetupCopyOEMInf exit (0x00000050)} 01:18:45.496
     dvi: Searching for hardware ID(s):
     dvi:      storage\volume
     inf: Opened PNF: 'C:\Windows\System32\DriverStore\FileRepository\volume.inf_amd64_neutral_1b1a512d99c5b72c\volume.inf' ([strings.0409])
     dvi: Selected driver installs from section [volume_install] in 'c:\windows\system32\driverstore\filerepository\volume.inf_amd64_neutral_1b1a512d99c5b72c\volume.inf'.
     dvi: Class GUID of device remains: {71a27cdd-812a-11d0-bec7-08002be2092f}.
     dvi: Set selected driver complete.
     ndv: Driver selected, now performing install...
     ndv: {Core Device Install} 01:18:45.496
     inf:      Opened INF: 'C:\Windows\INF\volume.inf' ([strings.0409])
     inf:      Saved PNF: 'C:\Windows\INF\volume.PNF' (Language = 0409)
     inf:      Opened PNF: 'C:\Windows\INF\volume.inf' ([strings.0409])
     dvi:      {DIF_ALLOW_INSTALL} 01:18:45.496
     dvi:           CoInstaller 1: Enter 01:18:45.496
     dvi:           CoInstaller 1: Exit
     dvi:           Class installer: Enter 01:18:45.496
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:18:45.496
     dvi:           Default installer: Exit
     dvi:      {DIF_ALLOW_INSTALL - exit(0xe000020e)} 01:18:45.496
     ndv:      Installing files...
     dvi:      {DIF_INSTALLDEVICEFILES} 01:18:45.542
     dvi:           CoInstaller 1: Enter 01:18:45.542
     dvi:           CoInstaller 1: Exit
     dvi:           Class installer: Enter 01:18:45.542
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:18:45.542
     dvi:                {Install FILES}
     inf:                     Opened PNF: 'c:\windows\system32\driverstore\filerepository\volume.inf_amd64_neutral_1b1a512d99c5b72c\volume.inf' ([strings.0409])
     inf:                     {Install Inf Section [volume_install.NTAMD64]}
     inf:                          CopyFiles=volume_copyfiles  (volume.inf line 31)
     flq:                          CopyFiles from an inbox inf.
     cpy:                          Open PnpLockdownPolicy: Err=2. This is OK. Use LockDownPolicyDefault
     flq:                          QueueSingleCopy...
     flq:                          Inf     : 'c:\windows\system32\driverstore\filerepository\volume.inf_amd64_neutral_1b1a512d99c5b72c\volume.inf'
     flq:                          SourceInf: 'c:\windows\system32\driverstore\filerepository\volume.inf_amd64_neutral_1b1a512d99c5b72c\volume.inf'
     flq:                          SourceSection: [sourcedisksfiles]
     flq:                          Source root path based on SourceInf
     flq:                          SourceRootPath: 'C:\Windows\System32\DriverStore\FileRepository\volume.inf_amd64_neutral_1b1a512d99c5b72c'
     flq:                          {FILE_QUEUE_COPY}
     flq:                               CopyStyle      - 0x09000000
     flq:                               {FILE_QUEUE_COPY}
     flq:                                    CopyStyle      - 0x09000000
     flq:                                    SourceRootPath - 'C:\Windows\System32\DriverStore\FileRepository\volume.inf_amd64_neutral_1b1a512d99c5b72c'
     flq:                                    SourceFilename - 'volsnap.sys'
     flq:                                    TargetDirectory- 'C:\Windows\system32\DRIVERS'
     flq:                                    TargetFilename - 'volsnap.sys'
     flq:                                    SourceDesc     - 'windows cd'
     flq:                               {FILE_QUEUE_COPY exit(0x00000000)}
     flq:                          {FILE_QUEUE_COPY exit(0x00000000)}
     inf:                     {Install Inf Section [volume_install.NTAMD64] exit (0x00000000)}
     dvi:      