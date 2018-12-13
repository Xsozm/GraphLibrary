     Opened INF: 'C:\Windows\System32\DriverStore\FileRepository\volsnap.inf_amd64_neutral_7499a4fac85b39fc\volsnap.inf' ([strings.0409])
     inf:      Saved PNF: 'C:\Windows\System32\DriverStore\FileRepository\volsnap.inf_amd64_neutral_7499a4fac85b39fc\volsnap.PNF' (Language = 0409)
     dvi:      Created Driver Node:
     dvi:           HardwareID   - STORAGE\VolumeSnapshot
     dvi:           InfName      - C:\Windows\System32\DriverStore\FileRepository\volsnap.inf_amd64_neutral_7499a4fac85b39fc\volsnap.inf
     dvi:           DevDesc      - Generic volume shadow copy
     dvi:           DrvDesc      - Generic volume shadow copy
     dvi:           Provider     - Microsoft
     dvi:           Mfg          - Microsoft
     dvi:           ModelsSec    - MSFT.NTamd64
     dvi:           InstallSec   - volume_snapshot_install
     dvi:           ActualSec    - volume_snapshot_install.NTAMD64
     dvi:           Rank         - 0x00ff0000
     dvi:           Signer       - Microsoft Windows
     dvi:           Signer Score - INBOX
     dvi:           DrvDate      - 06/21/2006
     dvi:           Version      - 6.1.7600.16385
     inf:      Searched 1 potential matches in published INF directory
     inf:      Searched 35 INFs in directory: 'C:\Windows\inf'
     dvi: {Build Driver List - exit(0x00000000)} 01:26:09.875
     ndv: Selecting best match from Driver Store (including Device Path)...
     dvi: {DIF_SELECTBESTCOMPATDRV} 01:26:09.875
     dvi:      No class installer for 'Storage volume shadow copies'
     dvi:      No CoInstallers found
     dvi:      Default installer: Enter 01:26:09.891
     dvi:           {Select Best Driver}
     dvi:                Selected driver installs from section [volume_snapshot_install] in 'c:\windows\system32\driverstore\filerepository\volsnap.inf_amd64_neutral_7499a4fac85b39fc\volsnap.inf'.
     dvi:                Class GUID of device changed to: {533c5b84-ec70-11d2-9505-00c04f79deaf}.
     dvi:                Set selected driver complete.
     dvi:                Selected:
     dvi:                     Description - [Generic volume shadow copy]
     dvi:                     InfFile     - [c:\windows\system32\driverstore\filerepository\volsnap.inf_amd64_neutral_7499a4fac85b39fc\volsnap.inf]
     dvi:                     Section     - [volume_snapshot_install]
     dvi:                     Signer      - [Microsoft Windows]
     dvi:                     Rank        - [0x00ff0000]
     dvi:           {Select Best Driver - exit(0x00000000)}
     dvi:      Default installer: Exit
     dvi: {DIF_SELECTBESTCOMPATDRV - exit(0x00000000)} 01:26:09.891
     inf: {SetupCopyOEMInf: C:\Windows\INF\volsnap.inf} 01:26:09.891
     inf:      Driver Store location: C:\Windows\System32\DriverStore\FileRepository\volsnap.inf_amd64_neutral_7499a4fac85b39fc\volsnap.inf
     inf:      Published Inf Path: C:\Windows\INF\volsnap.inf
     inf: {SetupCopyOEMInf exit (0x00000050)} 01:26:09.891
     dvi: Searching for hardware ID(s):
     dvi:      storage\volumesnapshot
     inf: Opened PNF: 'C:\Windows\System32\DriverStore\FileRepository\volsnap.inf_amd64_neutral_7499a4fac85b39fc\volsnap.inf' ([strings.0409])
     dvi: Selected driver installs from section [volume_snapshot_install] in 'c:\windows\system32\driverstore\filerepository\volsnap.inf_amd64_neutral_7499a4fac85b39fc\volsnap.inf'.
     dvi: Class GUID of device changed to: {533c5b84-ec70-11d2-9505-00c04f79deaf}.
     dvi: Set selected driver complete.
     ndv: Driver selected, now performing install...
     ndv: {Core Device Install} 01:26:09.891
     inf:      Opened INF: 'C:\Windows\INF\volsnap.inf' ([strings.0409])
     inf:      Saved PNF: 'C:\Windows\INF\volsnap.PNF' (Language = 0409)
     inf:      Opened PNF: 'C:\Windows\INF\volsnap.inf' ([strings.0409])
     sig:      {_VERIFY_FILE_SIGNATURE} 01:26:09.891
     sig:           Key      = volsnap.inf
     sig:           FilePath = C:\Windows\INF\volsnap.inf
     sig:           Success: A valid signature was found in an installed catalog
     