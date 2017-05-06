This README file contains information on the contents of the
meta-influx layer.

Please see the corresponding sections below for details.


Dependencies
============

This layer depends on:

  URI: git://github.com/mem/oe-meta-go.git
  branch: master

  URI: git://github.com/imyller/meta-nodejs.git
  branch: master


Patches
=======

For bugreports please use Github issues. For bugfixes/patches use Github pullrequests.


Table of Contents
=================

  I. influxdb and its depends as go recipes
 II. telegraf and its depends as go recipes
III. grafana

I. Adding the meta-influx layer to your build
=================================================

--- replace with specific instructions for the meta-influx layer ---

In order to use this layer, you need to make the build system aware of
it.

Assuming the meta-influx layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the meta-influx layer to bblayers.conf, along with any
other layers needed. e.g.:

  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-poky \
    /path/to/yocto/meta-yocto-bsp \
    /path/to/yocto/meta-influx \
    "


