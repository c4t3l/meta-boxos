This README file contains information on the contents of the meta-boxos layer.

Please see the corresponding sections below for details.

Dependencies
============

  URI: git://git.yoctoproject.org/poky.git  
  branch: dunfell

  URI: git://git.openembedded.org/openembedded-core  
  branch: dunfell

  URI: git://git.yoctoproject.org/meta-intel  
  branch: dunfell

  URI: git://git.yoctoproject.org/meta-cloud-services  
  branch: dunfell

  URI: git://git.yoctoproject.org/meta-virtualization  
  branch: dunfell

  .
  .
  .

Patches
=======

Please submit any patches against the meta-boxos layer to the xxxx mailing list (xxxx@zzzz.org)
and cc: the maintainer:

Maintainer: XXX YYYYYY <xxx.yyyyyy@zzzzz.com>

Table of Contents
=================

  I. Adding the meta-distro layer to your build
 II. Misc


I. Adding the meta-distro layer to your build
=================================================

Run 'bitbake-layers add-layer meta-distro'

II. Misc
========

Meta-boxos creates a systemd based container operating system.  There is no docker/podman software installed with this layer. 
It makes use of the primitives provided by systemd only.  The following systemd features are installed:

- systemd-networkd  
- systemd-resolved  
- systemd-nspawn  
- systemd-portabled  
- systemd-hostnamed  
- systemd-timedated  
- systemd-timesyncd

