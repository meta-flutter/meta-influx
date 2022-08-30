DESCRIPTION = "github.com/miekg/dns"

GO_IMPORT = "github.com/miekg/dns"

inherit go

SRC_URI = "git://github.com/miekg/dns;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "99f84ae56e75126dd77e5de4fae2ea034a468ca1" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=147353de6868a20caa562d26eab7b3c5"

FILES:${PN} += "${GOBIN_FINAL}/*"
