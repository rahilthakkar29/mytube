package com.mytube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService service;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, EmailService service) {
        this.encoder = encoder;
        this.database = database;
        this.service = service;
    }

    public void process(Video video) {
        encoder.encode(video);

        database.store(video);

        service.sendEmail(video.getUser());
    }
}
