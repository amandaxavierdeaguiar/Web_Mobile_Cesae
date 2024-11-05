import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OutroComponentComponent } from './outro-component.component';

describe('OutroComponentComponent', () => {
  let component: OutroComponentComponent;
  let fixture: ComponentFixture<OutroComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OutroComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OutroComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
