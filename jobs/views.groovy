listView('python') {
    description('Python pipelins')
    jobs {
        regex(/.*python.*/)
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
