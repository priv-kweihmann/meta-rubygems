# SPDX-License-Identifier: MIT
# Copyright (c) 2021, Konrad Weihmann

python rubygems_debug_handler() {
    # print out mkmf.log from failed
    # native compilation, this file is otherwise
    # deeply hidden but essential for debugging
    # failed tasks
    if e.taskname not in ["do_install"]:
        return
    if not bb.data.inherits_class('rubygems', d):
        return

    for root, dirs, files in os.walk(d.expand("${GEM_HOME}")):
        for _file in files:
            if os.path.basename(_file) == "mkmf.log":
                with open(os.path.join(root, _file)) as i:
                    bb.warn(i.read())
                break
}

addhandler rubygems_debug_handler
rubygems_debug_handler[eventmask] = "bb.build.TaskFailed"
